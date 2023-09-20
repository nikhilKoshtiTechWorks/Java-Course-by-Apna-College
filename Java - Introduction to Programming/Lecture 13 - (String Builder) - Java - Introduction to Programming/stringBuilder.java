public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));

        // new function set char at
        sb.setCharAt(0, 'h');
        System.out.println(sb);
        // Index 4 is out of bound
        //sb.setCharAt(4, 'i');

        // insert()        // inserts in between the string 
        sb.insert(0,'p');
        System.out.println(sb);
        sb.insert(3,'n');
        System.out.println(sb);

        // delete()
        sb.delete(3, 5); // here 4 is non-exclusive
        System.out.println(sb);

        //append()  // insert can also do the samefuction but it can add just one char not string (multiple chars)
        sb.append(" is dump");     // str = str + " is dump"  in the normal string
        System.out.println(sb+" "+sb.length());
    }
}
