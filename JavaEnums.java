class JavaEnums {
    public enum n{
        IZWILE,
        LWANELE
    }
    
    public static void main(String[] args) {
        //System.out.println("Hello "+n.LWANELE);
        System.out.println("Hello "+Member.MEMBER2.getName());
    }
}

enum Member{
    MEMBER1("Izwile"),
    MEMBER2("Lwanele"); 
    
    private String name;

    Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}