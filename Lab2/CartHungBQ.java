public class CartHungBQ {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DVDHungBQ itemsOrdered[] = new DVDHungBQ[MAX_NUMBERS_ORDERED];

    private int qtyOrdered = 0;

    //Add DVD
    public void addDVDHbq(DVDHungBQ disc) {
        if(qtyOrdered < 20) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The DVD " + '\"' + disc.getTitleHbq() + '\"' + " has been added!");
        } else {
            System.out.println("Your cart is full, can not add more!");
        }
    }

    //Remove DVD 
    public void removeDVDHbq(DVDHungBQ disc) {
        if(itemsOrdered[0] == null) {
            System.out.println("Your cart is empty!"); return ;
        }
        for(int i=0; i<qtyOrdered; i++){
            if(itemsOrdered[i].getTitleHbq().equals(disc.getTitleHbq())){
                for(int j=i; j<qtyOrdered-1; j++){
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                itemsOrdered[qtyOrdered-1] = null;
                qtyOrdered--;
                System.out.println("Remove DVD " + '\"' + disc.getTitleHbq() + '\"' + " successfully!");
                break;
            }
        }
    }

    //Caculate total cost
    public float totalCostHbq(){
        float total = 0;
        for(int i=0; i<qtyOrdered; i++){
            total += itemsOrdered[i].getCostHbq();
        }
        return total;
    }
}
