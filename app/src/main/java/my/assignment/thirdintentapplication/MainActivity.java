package my.assignment.thirdintentapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter<String> adapter;
    ArrayList<Courses> list=new ArrayList<Courses>();
    Courses course;
    ArrayList<String>courseList=new ArrayList<String>();
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(android.R.id.list);
        course=new Courses("Android Development","Mr.Abhinandan");
        list.add(course);
        course=new Courses("Big Data And Hadoop Development","Mr.Magesh");
        list.add(course);
        course=new Courses("Java Development","Mr.Amit");
        list.add(course);
        course=new Courses("FrontEnd WEb Development","Mr.Jhon Doe");
        list.add(course);
        for(int i=0;i<list.size();i++){
            courseList.add(list.get(i).getName());
        }
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,courseList);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) list.get(itemPosition).getMentor();
                Intent mentorIntent=new Intent(getApplicationContext(),Main2Activity.class);
                mentorIntent.putExtra("name",itemValue);
                startActivity(mentorIntent);

            }
        });






    }



  //  @Override
 /*   protected void onListItemClick(ListView l, View v, int position, long id) {

        super.onListItemClick(l, v, position, id);

        // ListView Clicked item index
        int itemPosition     = position;

        // ListView Clicked item value
        String  itemValue    = (String) list.get(itemPosition).getMentor();
        Intent mentorIntent=new Intent(this,Main2Activity.class);
        mentorIntent.putExtra("name",itemValue);
        startActivity(mentorIntent);


    }*/
}


