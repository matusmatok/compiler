#! /usr/bin/perl -w
use strict;

#associative array (hash), with series name as key
my %count;  

while(my $line = <STDIN>) {  # read every line on input
    chomp $line;    # delete end of line, if any

    # split the input line to columns on every tab, store them in an array
    my @columns = split "\t", $line;  

    # check input - should have 7 columns
    die "Bad input '$line'" unless @columns == 7;

    my $series = $columns[0];

    # increase the counter for this series
    $count{$series}++;
}

# write out results, series sorted alphabetically
foreach my $series (sort keys %count) {
    print $series, " ", $count{$series}, "\n";
}