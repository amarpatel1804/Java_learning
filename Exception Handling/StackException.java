class StackOverFlow extends Exception{
    public String toString(){
        return "Stack Is Full";
    }
}

class StackUnderFlow extends Exception{
    public String toString(){
        return "Stack Is Empty";
    }
}

class Stack{
    private int size;
    private int top=-1;
    private int S[];

    Stack(int sz){
        size=sz;
        S=new int[size];
    }

    public void push(int x) throws StackOverFlow{
        if(top==size-1){
            throw new StackOverFlow();
        }
        top++;
        S[top]=x;
    }

    public int pop() throws StackUnderFlow{
        int x;
        if(top==-1){
            throw new StackUnderFlow();
        }
        x=S[top];
        return x;
    }

}

public class StackException{
    public static void main(String[] args) {

        Stack st=new Stack(5);

        try {
            st.push(10);
            st.push(10);
            st.push(10);
            st.push(10);
            st.push(10);
            st.push(10);
        }catch (StackOverFlow e){
            System.out.println(e);
        }

    }
}



//public class StackException {
//
//    public static class StackOverFlow extends Exception{
//        public String toString(){
//            return "Stack Is Full";
//        }
//    }
//
//    public static class StackUnderFlow extends Exception{
//        public String toString(){
//            return "Stack Is Empty";
//        }
//    }
//
//    static class stack{
//        private int size;
//        private int S[];
//        private int top=-1;
//
//        public stack(int sz){
//            size=sz;
//            S=new int[sz];
//        }
//
//        public void push(int x) throws StackOverFlow{
//            if(top==size-1)
//                throw new StackOverFlow();
//
//            top++;
//            S[top]=x;
//        }
//
//        public int pop() throws StackUnderFlow
//        {
//            int x;
//
//            if(top==-1){
//                throw new StackUnderFlow();
//            }
//
//            x=S[top];
//            top--;
//            return x;
//        }
//
//    }
//
//    public static void main(String[] args)  {
//        stack st=new stack(4);
//        try{
//            st.push(10);
//            st.push(2);
//            st.push(10);
//            st.push(2);
//            st.push(10);
//            st.push(2);
//
//        }
//        catch (StackOverFlow e){
//            System.out.println(e);
//        }
//    }
//
//}

