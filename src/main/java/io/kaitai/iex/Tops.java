package io.kaitai.iex;

import io.kaitai.struct.KaitaiStream;
import io.kaitai.struct.KaitaiStruct;

import java.io.IOException;
import java.nio.charset.Charset;

public class Tops extends KaitaiStruct {
    private int messageType;
    private QuoteUpdate body;
    private Tops _root;
    private KaitaiStruct _parent;

    public Tops(KaitaiStream _io) {
        super(_io);
        this._root = this;
        _read();
    }

    public Tops(KaitaiStream _io, KaitaiStruct _parent) {
        super(_io);
        this._parent = _parent;
        this._root = this;
        _read();
    }

    public Tops(KaitaiStream _io, KaitaiStruct _parent, Tops _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root;
        _read();
    }

    public static Tops fromFile(String fileName) throws IOException {
        return new Tops(new KaitaiStream(fileName));
    }

    private void _read() {
        this.messageType = this._io.readU1();
        switch (messageType()) {
            case 81: {
                this.body = new QuoteUpdate(this._io, this, _root);
                break;
            }
        }
    }

    public int messageType() {
        return messageType;
    }

    public QuoteUpdate body() {
        return body;
    }

    public Tops _root() {
        return _root;
    }

    public KaitaiStruct _parent() {
        return _parent;
    }

    public static class QuoteUpdate extends KaitaiStruct {
        private int flags;
        private long timestamp;
        private String symbol;
        private long bidSize;
        private long bidPrice;
        private long askPrice;
        private long askSize;
        private Tops _root;
        private Tops _parent;
        public QuoteUpdate(KaitaiStream _io) {
            super(_io);
            _read();
        }
        public QuoteUpdate(KaitaiStream _io, Tops _parent) {
            super(_io);
            this._parent = _parent;
            _read();
        }
        public QuoteUpdate(KaitaiStream _io, Tops _parent, Tops _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static QuoteUpdate fromFile(String fileName) throws IOException {
            return new QuoteUpdate(new KaitaiStream(fileName));
        }

        private void _read() {
            this.flags = this._io.readU1();
            this.timestamp = this._io.readU8le();
            this.symbol = new String(this._io.readBytes(10), Charset.forName("ASCII"));
            this.bidSize = this._io.readU4le();
            this.bidPrice = this._io.readU8le();
            this.askPrice = this._io.readU8le();
            this.askSize = this._io.readU4le();
        }

        public int flags() {
            return flags;
        }

        public long timestamp() {
            return timestamp;
        }

        public String symbol() {
            return symbol;
        }

        public long bidSize() {
            return bidSize;
        }

        public long bidPrice() {
            return bidPrice;
        }

        public long askPrice() {
            return askPrice;
        }

        public long askSize() {
            return askSize;
        }

        public Tops _root() {
            return _root;
        }

        public Tops _parent() {
            return _parent;
        }
    }
}
