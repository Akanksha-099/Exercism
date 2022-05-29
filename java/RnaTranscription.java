import java.util.Map;
import static java.util.Map.entry;
import java.util.stream.Collectors;
public class RnaTranscription {
    private static final Map<Character, String> dnaToRna = Map.ofEntries(
            entry('G', "C"),
            entry('C', "G"),
            entry('T', "A"),
            entry('A', "U"));
    public String transcribe(String dnaStrand) {
        if (dnaStrand.matches(".*[^ACGT].*")) {
            throw new IllegalArgumentException("Invalid input");
        }
        return dnaStrand.chars()
                .mapToObj(i -> dnaToRna.get((char) i))
                .collect(Collectors.joining());
    }
}