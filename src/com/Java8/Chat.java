package com.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class Chat {

    private List<String> members;
    private List<Integer> files;
    private HashMap<Integer, String> message;

    public Chat() {
        this.members = new ArrayList<>();
        this.files = new ArrayList<>();
        this.message = new HashMap<>();
    }

    public void add(int[] ids) {
        this.files = Arrays.stream(ids).boxed().collect(Collectors.toList());
        for(Integer id: this.files){
            System.out.println(id);
        }

    }

    public void add(String[] names) {
        this.members.addAll(Arrays.asList(names));
    }

    public void add(int id, String newMessage) {
        this.message.put(id, newMessage);
    }

    public void remove(String[] names) {
        Arrays.asList(names).forEach(name -> {
                    if (this.members.contains(name)) {
                        this.members.remove(name);
                    } else {
                        System.out.println("Members with name " + name + "does not exist");
                    }
                }
        );
    }

    public void remove(int[] ids) {
        for(int id : ids){
            if (this.files.contains(id)) {
                this.files.remove((Integer)id);
            } else {
                System.out.println("File with id " + id + " does not exist");
            }
        }
        /*Arrays.asList(ids).forEach(id -> {
                    if (this.files.contains(id)) {
                        this.files.remove(id);
                    } else {
                        System.out.println("File with id " + id + " does not exist");
                    }
                }
        );*/

    }

    public void remove(int id){
        if(this.message.containsKey(id)) {
            this.message.remove(id);
        }else{
            System.out.println("Message with id "+id+" does not exist");
        }
    }

    public static void main(String[] args) {
        Chat chat = new Chat();
        int[] a  = {567, 986 ,789};
        chat.add(a);
        chat.remove(a);
    }
}

class  Result{
    public static int printChat() {
        Chat chat = new Chat();

        return 0;
    }
}
/*

    public void remove(int id) {
        int count = this.message.entrySet().size();
        for (Map.Entry<Integer, String> entry : this.message.entrySet()) {

            if (mess != null) {
                count--;
                if (count < 1) {
                    mess = mess + " " + entry.getValue() + "'";
                } else {
                    mess = mess + " " + entry.getValue();
                }
            } else {
                mess = "'" + entry.getValue();
            }
        }

        System.out.println();


        this.message.forEach((key, value) -> {
            if (mess != null) {
                mess = mess + " " + value;
            }
        });

    }

}
*/

   /* public static void main(String []argh){


    }

*/