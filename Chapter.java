import java.util.ArrayList;
import java.util.List;

public class Chapter
{
    public String title;
    public Chapter(String title)
    {
        this.SubChapters = new ArrayList<SubChapter>();
        this.title=title;
    }

    public List<SubChapter> SubChapters;
    public Book book;

    public int createSubChapterList(String SubChapterName)
    {
        SubChapter schp = new SubChapter(SubChapterName);
        SubChapters.add(schp);
        return SubChapters.indexOf(schp);
    }

    public SubChapter getSubChapter(int index)
    {
        return SubChapters.get(index);
    }

    public String toString()
    {
        return "Chapter " + title;
    }

    public void print()
    {
        System.out.println("Chapter" + title);

        for(SubChapter SubChapter : SubChapters)
        {
            SubChapter.print();
        }
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

}