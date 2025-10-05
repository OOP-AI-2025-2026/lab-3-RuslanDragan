package org.example.task2;

import java.util.Arrays;

public class Cart {

    private Item[] contents;
    private int index;

    public Cart(Item[] contents) {
        this.contents = contents;
        this.index = 0;
    }

    public void add(Item item) {
        if (!isCartFull()) {
            this.contents[this.index] = item;
            this.index++;
        }
    }

    public void removeById(int itemId) {
        int foundIndex = findItemIndex(itemId);
        if (foundIndex != -1) {
            shiftArray(foundIndex);
        }
    }

    private int findItemIndex(int itemId) {
        for (int i = 0; i < this.index; i++) {
            if (this.contents[i].getId() == itemId) {
                return i;
            }
        }
        return -1;
    }

    private void shiftArray(int itemIndex) {
        for (int i = itemIndex; i < this.index - 1; i++) {
            this.contents[i] = this.contents[i + 1];
        }
        this.contents[this.index - 1] = null;
        this.index--;
    }

    public boolean isCartFull() {
        return this.index == this.contents.length;
    }

    public int getItemCount() {
        return this.index;
    }

    public Item getItemAt(int i) {
        if (i >= 0 && i < this.index) {
            return this.contents[i];
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Cart contents:\n");
        for (int i = 0; i < this.index; i++) {
            sb.append(this.contents[i]);
        }
        return sb.toString();
    }
}
