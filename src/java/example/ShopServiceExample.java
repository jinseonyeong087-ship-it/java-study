public class ShopServiceExample {
    public static void main(String[] args) {
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 ShopServiec 객체입니다.");
        } else {
            System.out.println("다른 ShopServiec 객체입니다.");
        }
    }
}


//ShopService.getInstance() 호출 시 항상 같은 instance 반환

//따라서 obj1 == obj2 → true