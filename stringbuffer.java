class stringbuffer{
    public static void main(String[] args){
        String s="Adithya";
        StringBuffer sb=new StringBuffer(s);
        sb.append(" hero");
        System.out.println(sb);
        sb.insert(0,"ram ");
        System.out.println(sb);
        sb.replace(0,  3,"raj");
        System.out.println(sb);

    }
}