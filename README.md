# Parser

An expression parser that uses
[Ephemerol](https://github.com/active-group/ephemerol) and
[Lawrence](https://github.com/active-group/lawrence).

## Direct Scanner and Parser Usage

`src/parser/core.clj` contains an implementation of the direct LR parser, see
`test/parser/core_test.clj` for tests and usage examples.

## Generated Scanner and Parser Usage

`lein generate` runs `src/parser/generate.clj` that writes the generated scanner
and parser to Clojure files `src/parser/generated_scanner.clj` and
`src/parser/generated_parser.clj`.  See `test/parser/generated_test.clj` for
tests and usage examples.  Run `lein generate` to re-generate scanner and parser
if you have changed the implementation.
