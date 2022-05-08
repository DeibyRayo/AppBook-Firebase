package dev.deiby.esteban.appbook_firebase;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import dev.deiby.esteban.appbook_firebase.model.Book;
import dev.deiby.esteban.appbook_firebase.recyclerview.BookAdapter;

public class MainActivityJ  extends AppCompatActivity {


    private RecyclerView rvBooks;
    private BookAdapter bookAdapter;
    private List<Book> mdata ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_book);

        initViews();
        initmdataBooks();
        setupBookAdapter();
    }

    private void setupBookAdapter() {

        bookAdapter = new BookAdapter(mdata);
        rvBooks.setAdapter(bookAdapter);
    }

    private void initmdataBooks() {

        mdata = new ArrayList<>();
        mdata.add(new Book(R.drawable.book_1));
        mdata.add(new Book(R.drawable.book2));
        mdata.add(new Book(R.drawable.book3));
        mdata.add(new Book(R.drawable.book4));
        mdata.add(new Book(R.drawable.book5));
        mdata.add(new Book(R.drawable.book6));
        mdata.add(new Book(R.drawable.book7));
        mdata.add(new Book(R.drawable.book8));
        mdata.add(new Book(R.drawable.book9));
        mdata.add(new Book(R.drawable.book10));
    }

    private void initViews() {

        rvBooks = findViewById(R.id.rv_book);
        rvBooks.setLayoutManager(new LinearLayoutManager(this));
        rvBooks.setHasFixedSize(true);
    }

}
