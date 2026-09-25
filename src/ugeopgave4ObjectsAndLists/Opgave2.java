package ugeopgave4ObjectsAndLists;

public class Opgave2 {

    //Opgave 2
        class WebProducts{
            String name;
            double price;
            String[] tags;


            WebProducts(String name, double price, String[] tags){
                this.name = name;
                this.price = price;
                this.tags = tags;
            }

            void printInfo(){
                System.out.println("\nProduct: "+name);
                System.out.println("Price: "+price+" DKK");
                System.out.println("-Tags-");
                for (String tag : tags){
                    System.out.println("*"+tag);
                }
            }


            boolean hasTag(String tag){

                for(String list : tags){

                    if (list.equals(tag)){
                        return true;
                    }
                }

                return false;
            }


        }



    void main(){


        //Opgave 2
            WebProducts keyboard = new WebProducts("Keyboard", 250, new String[]{"Sale", "New", "Electronics"});
            WebProducts monitor = new WebProducts("Gaming Monitor", 750, new String[]{"New", "Sale", "Electronics"});
            WebProducts laptop = new WebProducts("Study Laptop", 1299, new String[]{"Used", "Sale", "Electronics"});
            WebProducts milk = new WebProducts("Milk",11, new String[]{"New"});

            WebProducts[] allProducts = {keyboard, monitor, laptop, milk};

        System.out.println(keyboard.hasTag("omegalol"));



            for (WebProducts list : allProducts) {
                for (String tags : list.tags) {
                    if (tags.equals("Sale")) {
                        list.printInfo();
                    }

                }
            }

            double highestPrice = 0;
            for (WebProducts list : allProducts){

                if (highestPrice < list.price){
                    highestPrice = list.price;
                }
            }
            System.out.println("\nHighest priced product is: "+highestPrice+" DKK");


            priceRangeProducts(100, 1000, allProducts);


    }

    //Opgave 2 ekstra
    void priceRangeProducts(int min, int max, WebProducts[] products){
        System.out.println("\nProducts in the price range "+min+" - "+max+" DKK:");
        for(WebProducts list : products){
            if((list.price <= max) && (list.price >= min)){
                list.printInfo();
            }
        }
    }



}
