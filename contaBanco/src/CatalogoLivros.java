package src;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {


    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }


    public void addBooks(String title, String author, int publishYear) {
        livros.add(new Livro(title, author, publishYear));
    }

    public List<Livro> findByAuthor(String author) {
        List<Livro> foundAuthors = new ArrayList<>();

        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getAuthor().equals(author)) {
                    foundAuthors.add(l);
                }
            }
            return foundAuthors;
        }
        else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Livro> findByYearInterval(int initialYear, int finalYear) {

        List<Livro> foundBooks = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getPublishYear() >= initialYear && l.getPublishYear() <= finalYear) {
                    foundBooks.add(l);
                }
            }
        }
        return foundBooks;
    }

    public Livro findByTitle(String title) {
        Livro livro = null;
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getTitle().equals(title)) {
                    livro = l;
                    break;
                }
            }
        }
        return livro;
    }

    @Override
    public String toString() {
        return "CatalogoLivros{" +
                "livros=" + livros +
                '}';
    }
}
