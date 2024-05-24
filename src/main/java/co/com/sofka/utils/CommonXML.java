package co.com.sofka.utils;


import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jetbrains.annotations.NotNull;

import java.io.StringReader;

import static co.com.sofka.utils.ArchivosUtil.readFile;

public class CommonXML {
    public static @NotNull String getBodyToNumber(double valueUno) {
        return String.format(readFile("src/test/resources/XMLfiles/toWord.xml"),valueUno);
    }

    public static @NotNull String getBodyToDolar(double valueUno) {
        return String.format(readFile("src/test/resources/XMLfiles/toDolar.xml"),valueUno);
    }

    public static Element xmlToElements(String xmlString) {
        try {
            SAXBuilder saxBuilder = new SAXBuilder();
            Document document = saxBuilder.build(new StringReader(xmlString));
            return document.getRootElement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getNumberToWordsResult(Element rootElement) {
        if (rootElement == null) {
            return null;
        }
        Element bodyElement = rootElement.getChild("Body", rootElement.getNamespace());

        if (bodyElement != null) {
            Element numberToWordsResponseElement = bodyElement.getChild("NumberToWordsResponse", bodyElement.getNamespace("m"));

            if (numberToWordsResponseElement != null) {
                Element numberToWordsResultElement = numberToWordsResponseElement.getChild("NumberToWordsResult", numberToWordsResponseElement.getNamespace("m"));

                if (numberToWordsResultElement != null) {
                    return numberToWordsResultElement.getText();
                }
            }
        }
        return null;
    }

    public static String getNumberToDollarsResult(Element rootElement) {
        if (rootElement == null) {
            return null;
        }
        Element bodyElement = rootElement.getChild("Body", rootElement.getNamespace());

        if (bodyElement != null) {
            Element numberToWordsResponseElement = bodyElement.getChild("NumberToDollarsResponse", bodyElement.getNamespace("m"));

            if (numberToWordsResponseElement != null) {
                Element numberToWordsResultElement = numberToWordsResponseElement.getChild("NumberToDollarsResult", numberToWordsResponseElement.getNamespace("m"));

                if (numberToWordsResultElement != null) {
                    return numberToWordsResultElement.getText();
                }
            }
        }
        return null;
    }

}
