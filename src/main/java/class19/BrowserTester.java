package class19;

public class BrowserTester {
    public static void main(String[] args) {
       /* Chrome chrome = new Chrome();
        chrome.get("https://Amazon.com");
        chrome.performTest();
        chrome.closeBrowser();

        FireFox fireFox=new FireFox();
        fireFox.get("https://Amazon.com");
        fireFox.performTest();
        fireFox.closeBrowser();

//        Safari safari = new Safari();
//        safari.get("https:..Amazon.com");
//        safari.performTest();
//        safari.closeBrowser();

        Edge edge = new Edge();
        edge.get("https://Amazon.com");
        edge.performTest();
        edge.closeBrowser();*/

        System.out.println("********************************");

        //ARRAY THAT HOLDS OBJECTS OF ALL BROWSERS
        Browser [] bArr= {new Chrome(),new FireFox(),new Edge() };
        //Browser[] bArr={chrome,fireFox,edge};
        for (int i = 0; i <bArr.length ; i++) {

            Browser b=bArr[i];
            b.get("https://Amazon.com");
            b.performTest();
            b.closeBrowser();
        }
}}
