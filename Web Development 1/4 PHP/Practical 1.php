<!DOCTYPE html>
<html>
    <body>
        <?php
            //Sigle line comment
            /*
                multiline comments
            */
            print "<h1>UoK PHP Tutorials</h1>";
            $a = 5;
            $b = 7;

            echo $a + $b;
            $name = "Dharshitha";
            $x = 4.5;
            //Get variable type
            var_dump($b);
            echo "<br>";

            //PHP strings
            //Get string length
            echo strlen($name);
            echo "<br>";

            //Word count
            $para = "My name is ";
            echo str_word_count($para);
            echo "<br>";

            //Concat
            $mySelf = $para.$name;
            echo $mySelf;
            echo "<br>";

            $y = "54.5";
            var_dump($y);echo "<br>";
            var_dump(is_numeric($y));

            $y = (int) $y;
            echo $y;
            echo "<br>";
            var_dump($y);echo "<br>";

            //Math functions
            echo(min(10, 0, 23, 54, -3));
            echo "<br>";
            echo(max(10, 0, 23, 54, -3));
            echo "<br>";
            echo(abs(-563.4));
            echo "<br>";
            echo(sqrt(64));
            echo "<br>";
            echo(round(-563.4));
            echo "<br>";
            echo(round(-563.6));
            echo "<br>";
            echo(rand(12, 34));

        ?>
    </body>

</html>