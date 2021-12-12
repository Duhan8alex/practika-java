 class HomeWork {
     public static void main(String[] arge) {
        printThreeWords() ;
        checkSumSign() ;
        printColor() ;
        compareNumbers() ;
    }  
    
    static void printThreeWords() {
        System.out.println("Orange") ;
        System.out.println("Banana") ;
        System.out.println("Apple") ;
    }   
    
    static void checkSumSign() {
        int a = 4;
        int b = 3;
        System.out.println("Sum is " + (a + b >= 0? "positive" : "negative")) ;
    }
    
    static void printColor() {
        int value = 200;
            if (value <=0) {
                System.out.println("red");
        }   else if (value <= 100) {
            System.out.println("yellow");
        }    else {
            System.out.println("green");
        }
    
    }
    
    static void compareNumbers() {
        int a = 40;
        int b = 50;
        System.out.println(a >= b? " a >= b" : "a < b");
        }
    }
   