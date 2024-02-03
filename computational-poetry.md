poetry has at least two functions. first, it is the use of language for aesthetic, emotional, or cognitive expression. second, it is to explore the limits of language within these domains.

computational poems or code poems are both a text and a performance, which itself may be non-poetic or non-linguistic in nature.

there is great potential to leverage networking and multi user interaction, to create a poem+performance that is living as dialogues between people and texts. at the very least, computers and their materials provide a new medium for the transcription and transmission of poetry, as in the ["Automated Prayer Project"](https://web.archive.org/web/20180626131621/http://web.archive.org/web/20090227094717/http://www.philtered.net/~adam/app/prayterm.html)

----

```{bash}
read () { curl -s "$1" | pandoc -f html -t plain --columns=40 }
dadaesque () { sort -bfR }

read "https://thoughts.hnr.fyi/posts/2022/09/on_the_privilege_of_alienation/" | dadaesque
```
