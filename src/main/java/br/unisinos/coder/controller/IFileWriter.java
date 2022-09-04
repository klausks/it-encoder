package br.unisinos.coder.controller;

import java.io.InputStream;
import java.io.OutputStream;

public interface IFileWriter {
    public Byte writeSingleByte();

    public OutputStream openStream(String fileName);

    public void closeStream();
}
