
package editor;

import editor.display.CharacterDisplay;

import java.awt.event.KeyEvent;
import java.util.ArrayList;


/**
 * This class represents the document being edited. Using a 2d array
 * to hold the document content is probably not a very good choice.
 * Fixing this class is the main focus of the exercise. In addition to
 * designing a better data model, you must add methods to do at least
 * basic editing: write and delete text, and moving the cursor
 *
 * Implement the following commands
 *
 * @author evenalg
 */


public class Document {

    /** Document data structure(s) */
    DoublyLinkedList list;
    // pointer to the
    CharacterDisplay display;
    int tableRows;
    int tableColumn;
    int cursorX;

    public int getCursorX() {
        return cursorX;
    }

    public void setCursorX(int cursorX) {
        this.cursorX = cursorX;
        display.setCursorAt(cursorX, cursorY);
    }

    public int getCursorY() {
        return cursorY;
    }

    public void setCursorY(int cursorY) {
        this.cursorY = cursorY;
        display.setCursorAt(cursorX, cursorY);
    }

    int cursorY;

    public Document(CharacterDisplay display) {
        //set up data structure
        list = new DoublyLinkedList();
        this.display = display;
        tableRows = this.display.getHeight();
        tableColumn = this.display.getWidth();
        this.cursorX = 0;
        this.cursorY = 0;

    }

    private void updateDisplay() {
        // should be called at the end of the functionality
        // and should update the display
    }

    /*
     * The following methods are called from the actions. Decide on
     * the data structure(s) for Document first. Then finish these
     * methods
     */
    public void insertLine() {
        // create a new line in the data structure
        updateDisplay();
    }

    public void insertChar() {
        updateDisplay();
    }

    public void print() {

    }

    public void insert(char c) {
        // insert the character c into the data structure
        this.display.setCursorAt(cursorX, cursorY++);
        this.display.displayChar(c, cursorX,cursorY);
        list.addNode(c);
        updateDisplay();
    }

   /* public char deleteNext() {
    }

    public char deletePrev() {
    }

    public void moveCursor(String direction) {



       // }
    }

    private void updateDisplay(int line) {
        // for all visible characterso
        // show them in the rightplace
        display.displayChar(c, line, column);

        // and make the cursor stand out a little
        display.displayCursor(c, line, column);
    } */
}
