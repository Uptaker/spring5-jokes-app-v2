package codes.drinky.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    // ChuckNorrisQuotes does not utilize as a Spring component
//    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
//        this.chuckNorrisQuotes = chuckNorrisQuotes;
//    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
