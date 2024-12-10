package IPA;
import java.util.*;


class HeadSets {
    private String headsetName;
    private String brand;
    private int price;
    private boolean available;

    public HeadSets(String headsetName, String brand, int price, boolean available) {
        this.headsetName= headsetName;
        this.brand=brand;
        this.price=price;
        this.available=available;
    }

    public void setHeadsetName(String headsetName) {
        this.headsetName=headsetName;

    }

    public void setBrand(String brand) {
        this.brand=brand;
    }

    public void setPrice(int price) {
        this.price=price;
    }

    public void setAvailable(boolean available) {
        this.available=available;
    }

    public String getHeadsetName () {
        return headsetName;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public boolean getAvailable() {
         return available;
    }
}

public class Solution1 {

    public static int findTotalPriceForGivenBrand(HeadSets[] hs,String brand) {

        int sum=0;
        for(int i=0;i<hs.length;i++) {
            if(hs[i].getBrand().equalsIgnoreCase(brand)) {
                sum=sum+hs[i].getPrice();
            }
        }


        return sum;
    }

    public static HeadSets findAvailableHeadsetWithSecondMinPrice(HeadSets[] hs) {

        int count=0;
        HeadSets temp;
        for(int i=0;i<hs.length;i++) {
            if(hs[i].getAvailable()) {
                count++;
            }
        }
        HeadSets[] hs1= new HeadSets[count];
        int k=0;
        for(int i=0;i<hs.length;i++) {
            if(hs[i].getAvailable()) {
                hs1[k++]=hs[i];
            }
        }
        for(int i=0;i<hs1.length-1;i++) {
            for(int j=i+1;j<hs1.length;j++) {
                if(hs1[i].getPrice()>hs1[j].getPrice()) {
                    temp=hs1[i];
                    hs1[i]=hs1[j];
                    hs1[j]=temp;

                }
            }
        }
        if(count>0) {
            return hs1[1];
        }
        else {
           return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HeadSets[]hs= new HeadSets[4];
        for(int i=0;i<hs.length;i++) {
            String headsetName= sc.nextLine();
            String brand= sc.nextLine();
            //sc.nextLine();
            int price= sc.nextInt();
           // sc.nextLine();
            boolean available= sc.nextBoolean();
            sc.nextLine();
            hs[i]= new HeadSets(headsetName,brand,price,available);
        }
        String new_brand= sc.nextLine();

        int sum= findTotalPriceForGivenBrand(hs,new_brand);
        if(sum==0) {
            System.out.println(0);
        }
        else {
            System.out.println(sum);
        }

        HeadSets hs1= findAvailableHeadsetWithSecondMinPrice(hs);

        if(hs1!=null) {
            System.out.println(hs1.getBrand());
            System.out.println(hs1.getPrice());
        }
        else {
            System.out.println("No Headsets available with the given brand");
        }
    }
}
