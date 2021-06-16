public class StringExercise01 {
    public String listSentences(String str) {
        return str.replace('.',
                '\n').replace('?', '\n').replace('!', '\n');
    }
}
