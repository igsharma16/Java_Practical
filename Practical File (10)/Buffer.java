//Program illustrating creation of String Buffer in java.
// By Gulshan Sharma 25597


public class Buffer {
    public static void main(String[] args){
        Buffer sb = new Buffer();
        
        sb.show("Create an immutable String : \n");
        String str1 = new String("Nature is Beautiful\n");
        sb.show(str1);

        sb.show("Create a short notation string and display it");
        String str2 = "Admire the nature\n";
        sb.show(str2);

        sb.show("Create String Buffer:\n");
        StringBuffer sb1 = new StringBuffer("Wonderful World\n");
        sb.show(sb1.toString());

        sb.show("Create an empty String Buffer of default length");
        StringBuffer sb2 = new StringBuffer();
        sb.show("Add contents to it\n");
        sb2.append("Share your Experience\n");
        sb.show(sb2.toString());
    }


    void show(String displayString){
        System.out.println(displayString);
    }
}