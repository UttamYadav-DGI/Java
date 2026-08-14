public class stringImplementation {

    public static void main(String[] args)
    {

        String s="uttam";
        String s2="yadav";
        System.out.println(s+" "+s2);

        StringBuffer sb=new StringBuffer("hello");

        System.out.println(sb);
        sb.replace(0,sb.length(),"radheshyam");
        System.out.println(sb);

        StringBuilder sb2=new StringBuilder("yadav");
        sb2.append("uttam");
        System.out.println(sb2);

//        StringBuilder → faster, not synchronized
//        StringBuffer  → synchronized, thread-safe

        // split()
        String data = "Java,Python,C++";
        String[] languages = data.split(",");
        for(String language : languages) {
            System.out.println(language);
        }

        // important notes
        String s1="abc";
        String s3= new String("abc");

        //they both are storing a same value but there memory behaviour is different
        // when we declared like string s1="abc" , java check the string pool first.if "hello" already exist, java resuse it
        // but when we use new keyword java create a new object
    }
}
