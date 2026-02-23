package com.kovanlabsintern.javaweektask;

enum Order
{
    NEW{
        public void transition() throws Exception
        {
            setNextTransition(PROCESSING);
            if(Order.nextTransition==PROCESSING)
            {
                System.out.println("Processing your order.....");
            }
            else
            {
                throw new Exception("illegal state transition");
            }
        }
    },
    PROCESSING{
        public void transition() throws Exception
        {
            setNextTransition(SHIPPED);

            if(Order.nextTransition==SHIPPED)
            {
                System.out.println("Shipping your order.....");

            }
            else
            {
                throw new Exception("illegal state transition");
            }
        }
    },
    SHIPPED{
        public void transition() throws Exception
        {
            setNextTransition(DELIVERED);

            if(Order.nextTransition==DELIVERED)
            {
                System.out.println("Your order is deliverd.....");

            }
            else
            {
                throw new Exception("illegal state transition");
            }
        }
    },
    DELIVERED{
        public void transition() throws Exception
        {
            setNextTransition(null);

            if(Order.nextTransition==null)
            {
                System.out.println("Thanks for using our service!!!");

            }
            else
            {
                throw new Exception("illegal state transition");

            }
        }
    };
    private static Order nextTransition;
    public abstract void transition() throws Exception;
    public static Order getNextTransition() {
        return nextTransition;
    }
    public static void setNextTransition(Order nextTransition) {
        Order.nextTransition = nextTransition;
    }
}
public class StateOfOrder {
    public static void main(String[] args) throws Exception {

        Order.NEW.transition();
        Order.PROCESSING.transition();
        Order.SHIPPED.transition();
        Order.DELIVERED.transition();
    }

}