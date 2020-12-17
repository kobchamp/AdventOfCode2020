package com.kob.adventofcode2020.models

object Day3 {

    fun countTrees(r : Int, d : Int): Double {
        var index = 0
        var countO = 0
        var countX = 0

        for (i  in maps.indices step  d) {
            val map = maps[i]
            if (map[index] == '#') {
                countX++
//                Log.e("map", map.substring(0,index) + "X" +map.substring(index+1))
            } else if (map[index] == '.') {
                countO++
//                Log.e("map", map.substring(0,index) + "O" +map.substring(index+1))
            }

            index += r
            index %= map.length
        }
        return countX.toDouble()
    }

    val maps = arrayOf(
          "...#...#....#....##...###....#."
        , "#.#...#...#....#.........#..#.."
        , ".#....##..#.#..##..##.........."
        , ".....#.#.............#..#......"
        , ".......#...#.##.#......#..#.#.."
        , "#.#....#......##........##....."
        , ".....##.#....#..#...#...##...#."
        , "...#...#..#.......#..#...##...#"
        , "..........#...........##......."
        , "..#..#..#...................#.."
        , "#..#....#.....##.#.#..........#"
        , ".#.##.......###.....#.#...#...."
        , ".#..##....##....#.......#...###"
        , "#.#..##...#.#..#..............."
        , ".........#....#.......##.#.#..."
        , "...###...##....##...#..##.#..#."
        , "....#.........#..#...#.......#."
        , "....................#..#.#.#..."
        , "..#....#..........#...........#"
        , ".#.....#..#.....##........##..#"
        , "#..##..#...##............#..##."
        , ".#..##....#..........#..#.##.#."
        , "..#####..#.#............##....."
        , "...###.#....##..#.#....#.....#."
        , ".#.......##....#...#.#.....##.."
        , "...#....#...##.#...#..#........"
        , ".####.....#....#.#.#...#......."
        , "...#....#.....#.......#........"
        , "#..#.#.......#...#............#"
        , "...#.....###.##....#.#.###.#..."
        , ".#.........#.......#.#....##..."
        , "#.#..#...#.#...##......#..#...."
        , ".....#...#..#.#...#..###..#...."
        , "......#.........#...###........"
        , ".....#..##...#..........#.....#"
        , "..#..#.#.##.#...#....#....##..#"
        , "##....#.##...#.##.#..##....#..."
        , ".....#.#.#.#..#....##.#...#.#.."
        , ".....##.......#........#......."
        , "...#.#.....#...#...##.#......##"
        , "........#..#.#...#.#.....#.#..#"
        , "#..##...#.#...##..##...#.#...##"
        , ".##.#.#..#...#.....#.#.##.#...#"
        , ".#.####.........##.........#..#"
        , ".##..............#....#...#...#"
        , "......#...#..#...#..#..###.#..."
        , ".......##...#.#.#..##..#......#"
        , ".....#....#..##..#.........#..."
        , ".....#..#.#.#........#.#.####.."
        , "#..#.......###....##..........."
        , "#..##..........#.#......#.#...."
        , ".....##........#...#..##......."
        , "###...#.##.#.#.#.#.##...##....."
        , "....#...#........##.#.##..##..."
        , ".#..#.#.#......#.......##..#..#"
        , ".#...#.................#....#.."
        , ".##..#..........#..##.......#.."
        , ".#.#.#.....#..#.#.........##..#"
        , "...#......##...#.......#...##.."
        , "##...###....#.###.............#"
        , "#.....#.#..#.#..#........#.#.#."
        , ".....#.#......##..#.#.....#.##."
        , ".......#...........#..#.......#"
        , "..#....#.#.#......#.....#...#.."
        , ".....##........#..##..#..##...."
        , "#.#........#...##....#.#..##..."
        , "#......#......#....#..#...#.##."
        , "....#.#.......#.#.#............"
        , "......####.#.##...#.#.##.....##"
        , "..###.#.#..#.........#.####...."
        , ".#.......#..#.#....#.#..#.#.##."
        , "#....#....#............##...##."
        , "....#....#............#....#..#"
        , "..#........#..#....#..#..#...#."
        , ".#......##....#..........#....#"
        , "#.##.....#..........#.###.#...."
        , "....##...#.....#.#......#.##..."
        , "#.#.....#.......###.###..#..#.#"
        , "..###..##.............#.####.##"
        , "#....#.....#....#..##.......#.."
        , ".....#....#...#.#.#.#..#...#.##"
        , "...#.....#..#....###......#.#.#"
        , "##.........#.#..#..#.#..#.....#"
        , ".#.....#.#....#.........##..#.#"
        , ".#.#..#.###..#..#..........#..."
        , ".##....#.#.#...#......##.....#."
        , "#.#....#....#...#...##...#..#.."
        , "#...#........#....#....#......#"
        , "#......#...#..#.#.##.....##..#."
        , "....#...#......##...#..#....#.."
        , ".#......##.##.......#.......#.."
        , ".#...#..####...........#.#.#..."
        , ".........#...#.#.........#....."
        , "#.##.....#.#..#.#.###...###..#."
        , "#...##.###......#.###..##.#.##."
        , "...##.#.....#....#..#......#..."
        , "#....###.#..#...##.....#......#"
        , "........###...#...#............"
        , "........#....#...#...#....#...#"
        , "#....#..#..#....#.#........#.#."
        , "##...#.....#.#..........#..#..#"
        , "#.#...##.....#........#...#...#"
        , "##.#.#.......#...#..#.###....#."
        , ".#.......#....##..##...#.....#."
        , "#....#....#.....#.......#......"
        , ".##.##.##...##...#.#.#..#..#..."
        , "#..#..#.##....#......##....###."
        , ".......#.#.........#..##.#...##"
        , ".#..##...#....#.....#.........."
        , "..#.#...#......#.#..#.........."
        , ".##....#.#.#.##.......###...#.."
        , "..##.#...#.#.#.#.......#..#...."
        , "#..#.......#...#........#.....#"
        , ".....#.......#......###..#....."
        , "...##.#.......#.....##.....##.."
        , "##..#.......#.#.....#....#....."
        , "..#....#.##.##...#...#......#.."
        , ".#..#.###.#....###........#...#"
        , "....##.##...##..#..#.#....#...."
        , "..###...##.....##.............."
        , "#....#...##...#....#..........#"
        , ".##........#......##...##...#.#"
        , "..#.#.##..........#......#....."
        , "...#...#.........#.##........##"
        , "..#.#..#.#..#...#....#...#....."
        , "...##...#..#.###.#..#.#...#...."
        , "....###........#..#..##...#...."
        , "#.#....##.......#.#........#..."
        , ".###...#..#.#.#.#..#...#..##.##"
        , "..#.........#####.#......#..#.."
        , "#.....#.....##..#....#...#...#."
        , "...#..#....##....##.....##.#..."
        , ".........#............#.##....."
        , "....##.#..#....#.##.......#..##"
        , ".###....#.#..#......#.#.......#"
        , ".###...###.#.........#.#..#...#"
        , ".....#........#..#.#..#.#..##.#"
        , ".###..#....##.........#..##...."
        , "..#.......#..#..##...#.###.#..."
        , "#.......#...........#.#...#.###"
        , "#.##.##...##.#...##..#.....#..."
        , "..#..#........###.#.....##....."
        , "#.....##....#...##...####..#..#"
        , "....#........#...#...#........."
        , "......#.#.#.#.......#..#.....##"
        , "..#..#....#.....#.#...##......#"
        , "..#....#...#.###.........#.###."
        , "...#......##..#.#.....#...#...."
        , "...#.......#...#...#........##."
        , "............#...#..#....#.....#"
        , "....##......................#.."
        , "#.#.#....#....#..........##...."
        , "#.#.....#.#.##..#...#.##....##."
        , "...#...#..#...#..#.#.#.......#."
        , "#.....#..........#.........##.#"
        , "#...##..#..#.#.......###....#.."
        , ".#...#..##....#.....##.......#."
        , "....#.##.....#.........#.#....#"
        , "........#.#...####..#.......#.#"
        , ".####...#.#......####.....#.##."
        , "###..#....#..#.......#.#..##..#"
        , "#......#.#....##..#.##.#....#.#"
        , "...###...#...#..##.#..#..#.#..."
        , "...##..##....#..#.....#........"
        , ".....#..............#......#..#"
        , "......#....#......#..#........."
        , "#..#.....#.##...........##....."
        , ".#..#.#..................##...."
        , "#.#..#..##...#....#.#......#..."
        , ".##.#.##......#.##...#...#...#."
        , "..#...#.........#.#..#.#....#.."
        , ".#.####.#..#.#......##.#..#...."
        , "#..#.......#....#.............."
        , "....#............#..#.........."
        , ".....#####.....#.....#..##...##"
        , "#.#....#.#...............#..##."
        , ".#.#..#...#......#.....#.#.#..."
        , ".#....#.#.#......#.....##....#."
        , "....#....#.##..#.......###...##"
        , ".....#..#.##...#...#...#..#.#.."
        , "##..#........#.#..#..##......#."
        , ".#..#..##.......#..#.....#....."
        , ".#.#.....###..##.#.#..........."
        , "..##..##.####..........#..#...."
        , "..##..#..#...#....#......#.#..."
        , "#...#.#......##.....##.#..###.."
        , "#..#..............#........##.#"
        , ".........#.##..#.#..#..##.##.#."
        , "#....##....#.#..#.#...##..#...."
        , ".#....#.......#............##.."
        , ".......#.#.......#...#.#......#"
        , "......##...#.......#.#........#"
        , "..###..#.#.##....##...#....##.."
        , "..##.##..........##..###......."
        , ".#.#.#..#..#.#.......#.#...##.."
        , "..#..##.........#.###..#......#"
        , "....#.#.#...##.#...#...##..###."
        , "..###..##.........##...#...#..#"
        , ".#..##...#.......#.......#..#.#"
        , "........##....##....#.#.###.#.#"
        , "#.....#.#.................#.#.."
        , "....#.#.#.....##.####.#......#."
        , "....#.......#.#.##.##.........."
        , "...#...........#...#.##...#.###"
        , "#....#....#..........#.##......"
        , "##..#...........##.....##.##..."
        , ".#.##...##..##....#..#.....####"
        , "#...#...#.##..........##..##..."
        , "....##..#....#.....#.#...#....#"
        , "..#....#..##...###.#.#........."
        , "#......#.#.#...#...#.........#."
        , "#............###.#.#.#..##...#."
        , ".##.....####...##..##..#..##.#."
        , "#..#........#.....#.#.....#...#"
        , "#............#....#.#.#........"
        , "......##...##.#....#.....#...#."
        , "..#........##......#.#.....##.."
        , ".#..#..#.....##.......#..#.#..#"
        , ".#....#..#....##.#.#.#..#..#.##"
        , ".####.#..........#...#..##....."
        , "...###..###...##..#............"
        , "#..#.....##.#...#..##..#......."
        , ".....##....#...###.##...#......"
        , "...##..#...#..#..##....##....#."
        , "...###....#.###.#.#.##....#...."
        , "##.#.#.....#....#.#....#..#...."
        , ".......##.....#.#..##...##...#."
        , ".#....#.#...##.#..#....#.....#."
        , "..#...#..#...#.##........#...#."
        , "#....#......##.#....##...#.#..#"
        , ".....#..#..#..#......#...#.#.#."
        , "..###....#........#...#.......#"
        , "###...#.......#.#.......##.##.."
        , "......##.....#.#........#....#."
        , "#.##..#.#.#.#..#....#.##.....#."
        , "..........#.##.#...#...#..#..#."
        , "..#...##.#..........#..##.###.."
        , "..###..##.##..#.#...##.####..#."
        , "#.#.#...............##....###.#"
        , "....#.........#.#....#.#....#.#"
        , "..#...#.###...#....###.....#..."
        , "..#..#....#...#............#..."
        , ".#..#....#..##.....##.........."
        , "..#....#.#...#.#.#.#.......##.#"
        , ".........#....##........#.#...."
        , "...#..##.#..#.##...#...#.#....#"
        , "....####...#...####.#....###..#"
        , "......##...#.##.#.......#..#..."
        , "#.#...#.#...#.#...#....#.#.#..."
        , ".#.....##...#.....###.#....#..."
        , "......##.....###...#.#...#.#..."
        , "#..#..##.#.#......#....#..#..#."
        , "....#.###.....#..#...#.##.....#"
        , "##.##........#......#....#..##."
        , "##.....##.#.....#.....##.....#."
        , ".....#.##...#.#..#.#.#.....#..."
        , ".#.##..#...#.#..#.....#.#......"
        , ".....##.......#..#...##..#..#.."
        , "#.....#..#.####......#........#"
        , ".#..#..##.#..##............#..#"
        , ".##..#.#....##.##.....#......#."
        , ".......##.........#..#........."
        , ".#...#.......................#."
        , "#......#.#....##.#.......#..#.."
        , "..##..##......#.......#....#.#."
        , "##......#......##...##........."
        , "..#....####....#.#.....##.#.#.."
        , "..........#..#.#.#.....#..#.#.."
        , "##..##...........##.......#...."
        , "##....#.#....#..#......###....#"
        , "...#.#.#..#.......##.......#..."
        , "#....#.......#.......#........."
        , "...##......##....#...#......#.#"
        , "#......#####.#.........#.....#."
        , "#..#.............#..#....#...#."
        , ".......#.##..#..#..#..#....####"
        , "......#.##..##..........###...#"
        , ".#.##....###..#........#....##."
        , "#......#..#...###.#...#.....#.."
        , ".#.#.......#....##.......#.#..."
        , "..#.##..#..##.....#.........#.#"
        , "#.#...#..#.##....#.......##...."
        , ".#.....###....#.#..#...#.....#."
        , "#...#..#.......#.#.....##...#.#"
        , "#.#####.........#....##.....#.."
        , "#....#..##...#....#.##.......#."
        , ".#.#.........##....##....#....."
        , "...#..##.......#....#.#.#......"
        , "#.###.##...###....#.....#.####."
        , ".#...#.#.#..##.#..........#...."
        , "#.#.....#.##.#..####.....##.#.."
        , "...###.##..####.......#......##"
        , ".##..#.........#...#.#.....#.##"
        , "..#.....##....###.....#.#...##."
        , "#....#....#..#....#.##........."
        , "......###....#.#..#..#....##..."
        , ".#.#................#.......##."
        , "...#.......#.........#.#......."
        , "...#..........#...##.....###..."
        , "....#......#...#..............."
        , ".##...#....#.....#.##......#..."
        , ".#.....###...##..##...#.#......"
        , "....##........#.....#...#....#."
        , "#.........#.#...##...#.#..#...."
        , "...#.#.....#.#........#.#....#."
        , ".#........#.....#.#.#.#.#..#..."
        , "....#...#.....#.#....#........#"
        , "..###.#....#.#....##...##..#.##"
        , ".#....#.#.####.#.#.....#......."
        , ".#...#...#.................##.#"
        , "..................##..#..#.#.#."
        , ".#..#............##....###....."
        , ".......#....#...........#......"
        , "....#.#.#.....###.........#..##"
        , "...#.#....#.#.##.#.##.....##..#"
        , ".#.##.#...##...#.......#.....##"
        , ".#............#...#..##...#.#.#"
        , "#.##..#.##..#..##.###.#........"
        , "..............##....#...#..#.#."
        , ".#.#...#.#....#....###........#"
        , ".#....#.#....#......###........"
        , "..#.......##......#.##.....#..."
        , ".....#......#..#...#.#.....#..."
    )
}