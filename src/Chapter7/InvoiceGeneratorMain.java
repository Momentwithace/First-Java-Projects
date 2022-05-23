package Chapter7;

import java.util.*;

public class InvoiceGeneratorMain {
    public static void main(String[] args) {
        String customerName;
        String salesPerson;
        double grandTotal=0.0;
        int discount;
        List<Product>productList=new ArrayList<>();
        Product product;
        Scanner scanner=new Scanner(System.in);
        boolean continueCondition=true;
        System.out.println("What is the customer's name:");
        customerName=scanner.next();
        while (continueCondition) {
            product = new Product();


            System.out.println("What did the customer buy?:");
            product.setProductName(scanner.next());
            System.out.println("How many pieces?:");
            product.setProductUnit(scanner.nextInt());
            System.out.println("How much per unit?:");
            product.setPricePerUnit(scanner.nextDouble());
            productList.add(product);
            System.out.println("Add more items?: enter Yes or Y to Continue and No or N to stop");
            String answer=scanner.next();
            if(answer.equalsIgnoreCase("NO")||answer.equalsIgnoreCase("N")){
                continueCondition=false;
            }
        }
        System.out.println("Customer Discount");
        discount=scanner.nextInt();
        System.out.println("Sales Person Name:");
        salesPerson=scanner.next();
        System.out.println("RECEIPT>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("SEMICOLON STORE");
        System.out.println("MAIN BRANCH");
        System.out.println("Location: 312, HEBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03292002");
        System.out.println("Date:"+new Date());
        System.out.println("Cashier: "+salesPerson);
        System.out.println("Customer Name: "+customerName);
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
    System.out.println("                     Item Name  Item Unit  ItemPrice Total(NGN)");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        for(Product product1:productList){
            System.out.println(                                               product1.getProductName()+"                      "+product1.getProductUnit()+"                   "+product1.getPricePerUnit() +"                    "+product1.getPriceOnEachProduct());
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            grandTotal+=product1.getPriceOnEachProduct();
        }
        System.out.println("                        SUB Total:  "+grandTotal);
        double discountPrice=(grandTotal*discount)/100;
        System.out.println("                        Discount Price: "+discountPrice);
        double vat=(grandTotal*17.5)/100;
        System.out.println("                        VAT @ 17.50%: "+vat);
        grandTotal+=vat-discountPrice;
        System.out.println("                        Bill Total:  "+grandTotal);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("THIS IS NOT A RECEIPT KINDLY PAY "+grandTotal);
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
        System.out.println("Enter 1 to restart");
        int input = scanner.nextInt();

    }
}
