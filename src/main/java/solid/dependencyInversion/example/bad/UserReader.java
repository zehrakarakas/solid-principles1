package solid.dependencyInversion.example.bad;

import solid.dependencyInversion.example.good.Reader;

public class UserReader {
    private XMLReader xmlReader;  // What happens if we decide to use JSON format instead of XML format?
//    private JSONReader jsonReader;

    public UserReader(Reader xmlReader) {    // We need to add jsonReader in Constructor too
        this.xmlReader = (XMLReader) xmlReader;
    }

    public String getUsername() {            // public String getUsernameFromXML()
        return xmlReader.getUsername();
    }

//    public String getUsernameFromJSON() {
//        return jsonReader.getUsername();
//    }

}

