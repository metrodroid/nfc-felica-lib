# nfc-felica-lib

An Android library for accessing [Sony FeliCa contactless smart cards][0] (NFC). This card is
primarily used for [electronic money cards][1] in Japan.

Documentation for this library is contained within JavaDoc comments, in Japanese.

## Modifications

* **Upstream repository**: https://github.com/Kazzz/nfc-felica-lib
* **This repository**: https://github.com/metrodroid/nfc-felica-lib

This branch of the library is used in [Metrodroid][2], an Android application for reading public
transit smartcards.  It contains some modifications compared to upstream:

* Ported to Java 8.
* Builds on Android SDK 27.
* Deleted unused / useless code.
* Replaced some (but not all) Japanese-language comments.
* Added support for reading Octopus (Hong Kong) and Shenzhen Tong cards (which also use FeliCa).

No warranty is given to those who want to use this version of the library outside of
[Metrodroid][2]!  In particular:

* Write commands are untested.
* FeliCa Lite cards are untested.
* There is no open issue tracker for this library.
* The API is not considered "stable", and will change at any time without warning.

If you want a version that you can use yourself, please consider the upstream version instead.

It is recommended that you acquire a copy of Sony's FeliCa User Manual, as it will make
understanding this library much easier.

## License

Copyright 2011 [Kazzz][3].

Copyright 2016-2018 [Michael Farrell][4].

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

[0]: https://en.wikipedia.org/wiki/FeliCa
[1]: https://en.wikipedia.org/wiki/Electronic_money
[2]: https://github.com/micolous/metrodroid
[3]: https://github.com/Kazzz
[4]: https://github.com/micolous