package sample;




public class FURNITURE {
    private final String material;
    private final String designerfirstname;
    private final String designerlastname;

    public FURNITURE(String material, String designerfirstname, String designerlastname) {
        this.material = material;
        this.designerfirstname = designerfirstname;
        this.designerlastname = designerlastname;
    }

    public class table extends FURNITURE {
        private final int numberoflegs;

        public table(String material, String designerfirstname, String designerlastname,int numberoflegs) {
            super(material, designerfirstname, designerlastname);
            this.numberoflegs =numberoflegs;
        }
    }

}









