package com.campusdual.classroom;

import javax.sound.midi.Soundbank;
import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String> queue = new LinkedList<>();

        queue.add("Smith");
        queue.add("Montessori");
        queue.add("Peralta");
        queue.add("House");

        String headElement = queue.peek();
        System.out.println("El elemento en la cima de la cola es: " + headElement);
        return queue;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        while (!queue.isEmpty()){
            String element = queue.poll();
            System.out.println("Elemento eliminado: " + element);
        }

    }

    public static void main(String[] args) {
        Queue<String> myQueue = createQueue();
        System.out.println("Los elementos en la cola son: " + myQueue);

        System.out.println("Vaciando la cola...");
        printAndEmptyQueue(myQueue);

    }

}
