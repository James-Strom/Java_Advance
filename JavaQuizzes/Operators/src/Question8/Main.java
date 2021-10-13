//package Question8;
//
//class demo
//{
//    int a, b, c;
//    demo(int a, int b, int c)
//    {
//        this.a = a;
//        this.b = b;
//    }
//
//    demo()
//    {
//        a = b = c = 0;
//    }
//
//    demo operator+(const demo &obj)
//    {
//        demo object;
//        object.a = this.a + obj.a;
//        object.b = this.b + obj.b;
//        object.c = this.c + obj.c;
//        return object;
//    }
//}
//
//class Test
//{
//    public static void main(String[] args)
//    {
//
//        demo obj1 = new demo(1, 2, 3);
//        demo obj2 = new demo(1, 2, 3);
//        demo obj3 = new demo();
//
//        obj3 = obj1 + obj2;
//        System.out.println ("obj3.a = " + obj3.a);
//        System.out.println ("obj3.b = " + obj3.c);
//        System.out.println ("obj3.c = " + obj3.c);
//
//    }
//}