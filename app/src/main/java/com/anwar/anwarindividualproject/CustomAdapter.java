package com.anwar.anwarindividualproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Toast;

public class CustomAdapter extends BaseAdapter{
    Context context;
    String animals[];
    LayoutInflater inflter;
    Button icon = null;

    public CustomAdapter(Context context, String[] animals) {
        this.context = context;
        this.animals = animals;
        inflter = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return animals.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = inflter.inflate(R.layout.activity_gridview,null);
        }
        final ViewGroup vg = viewGroup;
        final int j = i;
        final Button icon = (Button) view.findViewById(R.id.icon);
        icon.setText(animals[i]);

        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //View child0 = vg.getChildAt(0);
                View child1 = vg.getChildAt(0);
                View child2 = vg.getChildAt(1);
                View child3 = vg.getChildAt(2);
                View child4 = vg.getChildAt(3);
                View child5 = vg.getChildAt(4);
                View child6 = vg.getChildAt(5);
                View child7 = vg.getChildAt(6);
                View child8 = vg.getChildAt(7);
                View child9 = vg.getChildAt(8);



                if(((Button) (view.findViewById(R.id.icon))).getText().toString().equals(((Button) (child1.findViewById(R.id.icon))).getText().toString())){
                    View child11 = vg.getChildAt(0);
                    String label1 = ((Button) (child1.findViewById(R.id.icon))).getText().toString();

                    String label2 = ((Button) (child2.findViewById(R.id.icon))).getText().toString();

                    String label4 = ((Button) (child4.findViewById(R.id.icon))).getText().toString();

                    if (label2.equals("")) {
                        ((Button) (child2.findViewById(R.id.icon))).setText(label1);
                        ((Button) (child1.findViewById(R.id.icon))).setText("");
                    }
                    if (label4.equals("")) {
                        ((Button) (child4.findViewById(R.id.icon))).setText(label1);
                        ((Button) (child1.findViewById(R.id.icon))).setText("");
                    }
                }
                if(((Button) (view.findViewById(R.id.icon))).getText().toString().equals(((Button) (child2.findViewById(R.id.icon))).getText().toString())) {
                    // View child1 = vg.getChildAt(0);
                    String label1 = ((Button) (child1.findViewById(R.id.icon))).getText().toString();//((Button) (child1.findViewById(R.id.icon))).getText().toString();

                    // View child2 = vg.getChildAt(1);
                    String label2 = ((Button) (child2.findViewById(R.id.icon))).getText().toString();//((Button) (child1.findViewById(R.id.icon))).getText().toString();
                    // View child3 = vg.getChildAt(2);
                    String label3 = ((Button) (child3.findViewById(R.id.icon))).getText().toString();

                    //View child5 = vg.getChildAt(4);
                    String label5 = ((Button) (child5.findViewById(R.id.icon))).getText().toString();

                    if (label1.equals("")) {
                        ((Button) (child1.findViewById(R.id.icon))).setText(label2);
                        ((Button) (child2.findViewById(R.id.icon))).setText("");
                    }
                    if (label3.equals("")) {
                        ((Button) (child3.findViewById(R.id.icon))).setText(label2);
                        ((Button) (child2.findViewById(R.id.icon))).setText("");
                    }

                    if (label5.equals("")) {
                        ((Button) (child5.findViewById(R.id.icon))).setText(label2);
                        ((Button) (child2.findViewById(R.id.icon))).setText("");
                    }

                }

                if(((Button) (view.findViewById(R.id.icon))).getText().toString().equals(((Button) (child3.findViewById(R.id.icon))).getText().toString())) {


                    // View child2 = vg.getChildAt(1);
                    String label2 = ((Button) (child2.findViewById(R.id.icon))).getText().toString();//((Button) (child1.findViewById(R.id.icon))).getText().toString();

                    // View child6 = vg.getChildAt(5);
                    String label6 = ((Button) (child6.findViewById(R.id.icon))).getText().toString();


                    //View child3 = vg.getChildAt(2);
                    String label3 = ((Button) (child3.findViewById(R.id.icon))).getText().toString();

                    if (label2.equals("")) {
                        ((Button) (child2.findViewById(R.id.icon))).setText(label3);
                        ((Button) (child3.findViewById(R.id.icon))).setText("");


                    }
                    if (label6.equals("")) {
                        ((Button) (child6.findViewById(R.id.icon))).setText(label3);
                        ((Button) (child3.findViewById(R.id.icon))).setText("");


                    }

                }

                if(((Button) (view.findViewById(R.id.icon))).getText().toString().equals(((Button) (child4.findViewById(R.id.icon))).getText().toString())) {

                    //  View child1 = vg.getChildAt(0);
                    // String label1 = icon.getText().toString();//((Button) (child1.findViewById(R.id.icon))).getText().toString();
                    String label1 = ((Button) (child1.findViewById(R.id.icon))).getText().toString();
                    // View child4 = vg.getChildAt(3);
                    String label4 = ((Button) (child4.findViewById(R.id.icon))).getText().toString();//((Button) (child1.findViewById(R.id.icon))).getText().toString();

                    // View child5 = vg.getChildAt(4);
                    String label5 = ((Button) (child5.findViewById(R.id.icon))).getText().toString();


                    // View child7 = vg.getChildAt(6);
                    String label7 = ((Button) (child7.findViewById(R.id.icon))).getText().toString();

                    if (label1.equals("")) {
                        ((Button) (child1.findViewById(R.id.icon))).setText(label4);
                        ((Button) (child4.findViewById(R.id.icon))).setText("");


                    }
                    if (label7.equals("")) {
                        ((Button) (child7.findViewById(R.id.icon))).setText(label4);
                        ((Button) (child4.findViewById(R.id.icon))).setText("");


                    }
                    if (label5.equals("")) {
                        ((Button) (child5.findViewById(R.id.icon))).setText(label4);
                        ((Button) (child4.findViewById(R.id.icon))).setText("");


                    }


                }


                if(((Button) (view.findViewById(R.id.icon))).getText().toString().equals(((Button) (child5.findViewById(R.id.icon))).getText().toString())) {


                    // View child2 = vg.getChildAt(2);
                    //String label2 = icon.getText().toString();//((Button) (child1.findViewById(R.id.icon))).getText().toString();
                    String label2 = ((Button) (child2.findViewById(R.id.icon))).getText().toString();
                    // View child4 = vg.getChildAt(3);
                    String label4 = ((Button) (child4.findViewById(R.id.icon))).getText().toString();//((Button) (child1.findViewById(R.id.icon))).getText().toString();

                    // View child6 = vg.getChildAt(5);
                    String label6 = ((Button) (child6.findViewById(R.id.icon))).getText().toString();


                    // View child5 = vg.getChildAt(4);
                    String label5 = ((Button) (child5.findViewById(R.id.icon))).getText().toString();

                    // View child8 = vg.getChildAt(7);
                    String label8 = ((Button) (child8.findViewById(R.id.icon))).getText().toString();


                    if (label2.equals("")) {
                        ((Button) (child2.findViewById(R.id.icon))).setText(label5);
                        ((Button) (child5.findViewById(R.id.icon))).setText("");


                    }
                    if (label6.equals("")) {
                        ((Button) (child6.findViewById(R.id.icon))).setText(label5);
                        ((Button) (child5.findViewById(R.id.icon))).setText("");


                    }
                    if (label4.equals("")) {
                        ((Button) (child4.findViewById(R.id.icon))).setText(label5);
                        ((Button) (child5.findViewById(R.id.icon))).setText("");


                    }
                    if (label8.equals("")) {
                        ((Button) (child8.findViewById(R.id.icon))).setText(label5);
                        ((Button) (child5.findViewById(R.id.icon))).setText("");


                    }

                }

                if(((Button) (view.findViewById(R.id.icon))).getText().toString().equals(((Button) (child6.findViewById(R.id.icon))).getText().toString())) {


                    // View child3 = vg.getChildAt(2);
                    // String label3 = icon.getText().toString();//((Button) (child1.findViewById(R.id.icon))).getText().toString();
                    String label3 = ((Button) (child3.findViewById(R.id.icon))).getText().toString();
                    // View child5 = vg.getChildAt(4);
                    String label5 = ((Button) (child5.findViewById(R.id.icon))).getText().toString();//((Button) (child1.findViewById(R.id.icon))).getText().toString();

                    // View child9 = vg.getChildAt(8);
                    String label9 = ((Button) (child9.findViewById(R.id.icon))).getText().toString();


                    // View child6 = vg.getChildAt(5);
                    String label6 = ((Button) (child6.findViewById(R.id.icon))).getText().toString();

                    if (label9.equals("")) {
                        ((Button) (child9.findViewById(R.id.icon))).setText(label6);
                        ((Button) (child6.findViewById(R.id.icon))).setText("");


                    }
                    if (label3.equals("")) {
                        ((Button) (child3.findViewById(R.id.icon))).setText(label6);
                        ((Button) (child6.findViewById(R.id.icon))).setText("");


                    }
                    if (label5.equals("")) {
                        ((Button) (child5.findViewById(R.id.icon))).setText(label6);
                        ((Button) (child6.findViewById(R.id.icon))).setText("");


                    }


                }


                if(((Button) (view.findViewById(R.id.icon))).getText().toString().equals(((Button) (child7.findViewById(R.id.icon))).getText().toString())) {

                    //View child4 = vg.getChildAt(3);
                    //String label4 = icon.getText().toString();//((Button) (child1.findViewById(R.id.icon))).getText().toString();
                    String label4 = ((Button) (child4.findViewById(R.id.icon))).getText().toString();

                    // View child8 = vg.getChildAt(7);
                    //String label8 = icon.getText().toString();//((Button) (child1.findViewById(R.id.icon))).getText().toString();
                    String label8 = ((Button) (child8.findViewById(R.id.icon))).getText().toString();

                    // View child7 = vg.getChildAt(6);
                    String label7 = ((Button) (child7.findViewById(R.id.icon))).getText().toString();
                    Toast.makeText(context,"label7 : "+label7,Toast.LENGTH_SHORT).show();

                    if (label4.equals("")) {
                        ((Button) (child4.findViewById(R.id.icon))).setText(label7);
                        ((Button) (child7.findViewById(R.id.icon))).setText("");


                    }
                    if (label8.equals("")) {
                        ((Button) (child8.findViewById(R.id.icon))).setText(label7);
                        ((Button) (child7.findViewById(R.id.icon))).setText("");


                    }

                }

                if(((Button) (view.findViewById(R.id.icon))).getText().toString().equals(((Button) (child8.findViewById(R.id.icon))).getText().toString())) {

                    // View child9 = vg.getChildAt(8);
                    //String label9 = icon.getText().toString();//((Button) (child1.findViewById(R.id.icon))).getText().toString();
                    String label9 = ((Button) (child9.findViewById(R.id.icon))).getText().toString();

                    // View child7 = vg.getChildAt(6);
                    // String label7 = icon.getText().toString();//((Button) (child1.findViewById(R.id.icon))).getText().toString();
                    String label7 = ((Button) (child7.findViewById(R.id.icon))).getText().toString();

                    // View child5 = vg.getChildAt(4);
                    //String label5 = ((Button) (child5.findViewById(R.id.icon))).getText().toString();
                    String label5 = ((Button) (child5.findViewById(R.id.icon))).getText().toString();


                    // View child8 = vg.getChildAt(7);
                    String label8 = ((Button) (child8.findViewById(R.id.icon))).getText().toString();

                    if (label9.equals("")) {
                        ((Button) (child9.findViewById(R.id.icon))).setText(label8);
                        ((Button) (child8.findViewById(R.id.icon))).setText("");


                    }
                    if (label7.equals("")) {
                        ((Button) (child7.findViewById(R.id.icon))).setText(label8);
                        ((Button) (child8.findViewById(R.id.icon))).setText("");


                    }
                    if (label5.equals("")) {
                        ((Button) (child5.findViewById(R.id.icon))).setText(label8);
                        ((Button) (child8.findViewById(R.id.icon))).setText("");


                    }


                }


                if(((Button) (view.findViewById(R.id.icon))).getText().toString().equals(((Button) (child9.findViewById(R.id.icon))).getText().toString())) {

                    // View child6 = vg.getChildAt(5);
                    String label6 = ((Button) (child6.findViewById(R.id.icon))).getText().toString();

                    // View child8 = vg.getChildAt(7);
                    String label8 = ((Button) (child8.findViewById(R.id.icon))).getText().toString();

                    String label9 = ((Button) (child9.findViewById(R.id.icon))).getText().toString();



                    // Toast.makeText(context, "Clicked " + icon.getText().toString(), Toast.LENGTH_SHORT).show();

                    if (label6.equals("")) {

                        ((Button) (child6.findViewById(R.id.icon))).setText(label9);

                        ((Button) (child9.findViewById(R.id.icon))).setText("");

                    }
                    if (label8.equals("")) {


                        ((Button) (child8.findViewById(R.id.icon))).setText(label9);
                        ((Button) (child9.findViewById(R.id.icon))).setText("");

                    }




                }

                if(((Button) (child1.findViewById(R.id.icon))).getText().toString().equals("1") &&((Button) (child2.findViewById(R.id.icon))).getText().toString().equals("2")
                        &&((Button) (child3.findViewById(R.id.icon))).getText().toString().equals("3")&&((Button) (child4.findViewById(R.id.icon))).getText().toString().equals("4")&&
                        ((Button) (child5.findViewById(R.id.icon))).getText().toString().equals("5")&&((Button) (child6.findViewById(R.id.icon))).getText().toString().equals("6")&&
                        ((Button) (child7.findViewById(R.id.icon))).getText().toString().equals("7")&&((Button) (child8.findViewById(R.id.icon))).getText().toString().equals("8")){

                    Toast.makeText(context,"HURRAH!!! YOU HAVE WON THE GAME",Toast.LENGTH_LONG).show();
                    view.getContext().startActivity(new Intent(context,WinScreen.class));

                }



            }
        });


        return view;
    }
}
