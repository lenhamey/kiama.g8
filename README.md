This is a giter8 template for sbt 0.11.x (or later) projects in the style that
I (inkytonik) commonly use. The generated project will be set up to use the
[Kiama language processing library](http://kiama.googlecode.com) and will
contain a simple example of Kiama use.

See `inkytonik/plain.g8` for a simpler variant that doesn't depend on Kiama.

### Properties

* illustration of how to use simple Kiama features to build a simple
language processor which is a REPL for a simple expression language

* examples of using ScalaTest and ScalaCheck ests with Kiama-based programs

* scalac options `-deprecation` and `-unchecked` turned on

* sbt log level is warning

* sbt shell prompt contains project name and version

* no project sub-directory

* sources and resources located directly under `src`

* stub `Main` object with a dummy `main` method

* tests located with sources with suffix `Tests.scala`

* Mercurial `.hgignore` file

### Usage

Install [giter8 (g8)](http://github.com/n8han/giter8#readme) and [sbt
0.11.x](https://github.com/harrah/xsbt/wiki/Setup) (or later).

In a shell run the following:

    g8 inkytonik/kiama

The `g8` command will prompt you for information needed to setup the
project.

Run the generated project to get a REPL as follows:

    cd $name$
    sbt
    > run
    exp> 0 + 4 * 1  
    e = Add(Num(0),Mul(Num(4),Num(1)))
    e tree:
    Add (Num (0), Mul (Num (4), Num (1)))
    e tree pretty printed:
    (0 + (4 * 1))
    value (e) = 4
    e optimised = Num(4)
    value (e optimised) = 4
    exp> ^D
    >

where `$name$` is the values you entered when running the `g8` command.
Use Control-D to get out of the REPL.
