package com.payne.se.innerClass;

public class View {
    interface OnClickListener{
        void onClick();
    }

    class Clock{

    }
}

class Widget{
    public void init(final int a){
        //内部接口就可以直接用 外部类.内部类来实例化，而内部类就不行了
        View.OnClickListener linstener=new View.OnClickListener(){
            @Override
            public void onClick() {}
        };

//        View.Clock c = new Clock();
    }


}
