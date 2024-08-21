
package com.example.wordlyweek.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.wordlyweek.model.Writer;
import com.example.wordlyweek.model.Magazine;

public interface WriterRepository {
    ArrayList<Writer> getWriters();

    Writer getWriterById(int writerId);

    Writer addWriter(Writer writer);

    Writer updateWriter(int writerId, Writer writer);

    void deleteWriter(int writerId);

    List<Magazine> getWriterMagazines(int writerId);
}
