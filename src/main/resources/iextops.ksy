meta:
  id: tops
  endian: le
seq:
  - id: message_type
    type: u1
  - id: body
    type:
      switch-on: message_type
      cases:
        0x51: quote_update
types:
  quote_update:
    seq:
      - id: flags
        type: u1 # or lots of individual flags
      - id: timestamp
        type: u8
      - id: symbol
        type: str
        encoding: ASCII
        size: 10
      - id: bid_size
        type: u4
      - id: bid_price
        type: u8
      - id: ask_price
        type: u8
      - id: ask_size
        type: u4
