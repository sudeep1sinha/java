public class string {
    public static void main (String[] args){
        String str = "sudeep";
        str = str + " kumar";

        String str1 = new String("kakashi");

        System.out.println(str);

        System.out.println(str1);
        System.out.println(str);

        StringBuffer sb = new StringBuffer("sudeep");
        sb.append("kumar");

        sb.insert(6 , " java ");
        sb.setLength(30);

        System.out.println(sb);

    }
}
