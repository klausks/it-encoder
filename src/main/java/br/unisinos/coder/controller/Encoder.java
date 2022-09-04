package br.unisinos.coder.controller;

import br.unisinos.coder.strategy.EncodingStrategy;

import java.io.*;

public class Encoder {
    private EncodingStrategy encodingStrategy;
    private IFileReader fileReader;
    private IFileWriter fileWriter;

    public Encoder(EncodingStrategy encodingStrategy, IFileReader fileReader, IFileWriter fileWriter) {
        this.encodingStrategy = encodingStrategy;
        this.fileReader = fileReader;
        this.fileWriter = fileWriter;
    }


}
