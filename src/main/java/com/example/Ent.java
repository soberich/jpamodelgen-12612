package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;
import java.nio.ByteBuffer;
import java.util.List;

@Entity
public class Ent {

    @Id
    Long id;

    @NotNull
    @Lob
    byte[] image;

    @NotNull
    ByteBuffer text;

    List<@NotNull byte[]> stuffs;
}
