## New Relic Coroutines ASM Error Repro

This repro demonstrates an `ArrayIndexOutOfBoundsException` encountered when 
using the New Relic weaver and a kotlin coroutine + suspend function.

Run `Main` to view the exception. 

This project includes the output of the ASMifier for two classes:
- A simple coroutine using a suspend function (`UseSuspendDump`), which produces the exception.
- A similar coroutine not using a suspend function (`NoSuspendDump`), which does not produce the exception. 

These classes were both instrumented with the New Relic Java Agent. See
the [app source here](https://github.com/kanderson250/NewRelic-ClassTransformer-Error/blob/main/app-code/src/MultipartApp.kt). 

Switch out the dump generator to `NoSuspendDump` and the error goes away. 