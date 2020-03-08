package Controller.Watch.service;

//reference: https://www.geeksforgeeks.org/collections-binarysearch-java-examples/
//reference: https://whatislife.tistory.com/8

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import org.springframework.stereotype.Service;

@Service

public class searchImpl implements search {
    private List al = new ArrayList();

    public void searchdata() {

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);
    }

    public void sequ_search() {
        al.indexOf(9);
    }

    public void bina_search() {
        Collections.binarySearch(al, 9);
    }

}
