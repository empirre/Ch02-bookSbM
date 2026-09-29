/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Saba Machavariani
 * @version 9/22/26
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = isCourseText;
    }

    // Accessor Method
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    public int getBorrowed()
    {
        return borrowed;
    }
    public String getRefNumber()
    {
        return refNumber;
    }
    public boolean isCourseText()
    {
        return courseText;
    }
    public void setRefNumber(String ref)
    {
        if (ref.length() >= 3) 
        {
        refNumber = ref;
        } 
        else 
        {
        System.out.println("Error: must be at least 3 characters!");
        }
    }
    public void borrow()
    {
        borrowed++;
    }
    
    //print statements
    public void printAuthor()
    {
        System.out.println(author);
    }
    public void printTitle()
    {
        System.out.println(title);
    }
    
    public void printDetails()
    {
    System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
    if (refNumber.length() > 0) 
    {
        System.out.println("Reference Number: " + refNumber);
    } 
    else {
        System.out.println("Reference Number: ZZZ");
        }
    }  
}
    
