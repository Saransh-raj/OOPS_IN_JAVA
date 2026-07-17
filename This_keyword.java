public class This_keyword {
    
    public static class Pokemon {
        int power;
        String type;

        // constructor
        Pokemon(int power,String type){
            this.power = power;
            this.type = type;
        }

        public void display(){
            System.out.println("Power : "+ power +" Type : "+type);
        }
    }

    public static void main(String[] args) {
        Pokemon pikachuu = new Pokemon(99, "Electric");
        Pokemon jigglipuff = new Pokemon(98, "fairy");

        pikachuu.display();
        jigglipuff.display();
    }
}
