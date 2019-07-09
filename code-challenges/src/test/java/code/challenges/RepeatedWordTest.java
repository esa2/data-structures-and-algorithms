package code.challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void RepeatHappyPath1() {
        RepeatedWord rp = new RepeatedWord();
        assertEquals("Should return a", rp.didItCollide("Once upon a time, there was a brave princess who..."), "a");
    }

    @Test
    public void RepeatHappyPath2() {
        RepeatedWord rp = new RepeatedWord();
        assertEquals("Should return it", rp.didItCollide("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only..."), "it");
    }

    @Test
    public void RepeatHappyPath3() {
        RepeatedWord rp = new RepeatedWord();
        assertEquals("Should return summer", rp.didItCollide("It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York..."), "summer");
    }

    @Test
    public void RepeatNoDup() {
        RepeatedWord rp = new RepeatedWord();
        assertEquals("Should return 'No repeated words found' when no dup words", rp.didItCollide("This string has no duplicate words"), "No repeated words found");
    }

    @Test
    public void RepeatEdge() {
        RepeatedWord rp = new RepeatedWord();
        assertEquals("Should return 'No repeated words found for empty string'", rp.didItCollide(""), "No repeated words found");
    }

    @Test
    public void RepeatEdge2() {
        RepeatedWord rp = new RepeatedWord();
        assertEquals("Should return 'a' when matching 'A' and 'a'", rp.didItCollide(" A a"), "a");
    }
}
