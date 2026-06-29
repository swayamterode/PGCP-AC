namespace FileIo;

internal class Program
{
    private const string Path = "/Users/swym/Documents/C#/ExamPrep/FileIO/data.txt";

    public static void Main(string[] args)
    {
        Create();
        Read();
        Update();
        Delete();
    }

    private static void Create()
    {
        File.WriteAllLines(Path, ["Apple", "Samsung", "Nokia"]);
        Console.WriteLine("Created!");
    }

    private static void Read()
    {
        if (!File.Exists(Path))
        {
            Console.WriteLine("No file found!");
            return;
        }

        foreach (var line in File.ReadAllLines(Path))
        {
            Console.WriteLine(line);
        }
    }

    private static void Update()
    {
        if (!File.Exists(Path))
        {
            Console.WriteLine("Files does not exists");
            return;
        }

        var lines = File.ReadAllLines(Path);
        for (int i = 0; i < lines.Length; i++)
            if (lines[i].Equals("Samsung"))
                lines[i] = "Motorola";
        File.WriteAllLines(Path, lines);
        Console.WriteLine("Updated 👍🏼");
    }

    private static void Delete()
    {
        if (File.Exists(Path))
            File.Delete(Path);
        Console.WriteLine("File Deleted!");
    }
}