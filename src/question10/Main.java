/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nandini Kandi
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> ids = new ArrayList<>();
        ids.add(5); //index=0
        ids.add(29); //index=1
        ids.add(34); //index=2
        ids.add(4); //index=3

        int searchNumber = 4;
        System.out.println("You are searching for " + searchNumber + " in the list.");
        int index = search(ids, 0, searchNumber);
        if (index != -1) {
            System.out.println("Index of " + searchNumber + " in list is = " + index);
        } else {
            System.out.println(searchNumber + " is not in the list.");
        }

    }

    public static int search(List<Integer> list, int index, int num) {
        if (index >= list.size()) {
            return -1;
        }
        if (list.get(index) == num) {
            return index;
        }

        return search(list, index + 1, num);
    }

}
