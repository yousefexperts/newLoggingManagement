/**
 * Created by morak on 5/16/16.
 */

var source = $("#table-template").html();
var template = Handlebars.compile(source);

var data = {
    users: [{
        person: {
            firstName: "Garry",
            lastName: "Finch"
        },
        jobTitle: "Front End Technical Lead",
        twitter: "gazraa"
    }, {
        person: {
            firstName: "Garry",
            lastName: "Finch"
        },
        jobTitle: "Photographer",
        twitter: "photobasics"
    }, {
        person: {
            firstName: "Garry",
            lastName: "Finch"
        },
        jobTitle: "LEGO Geek",
        twitter: "minifigures"
    }]
};

Handlebars.registerHelper('fullName', function (person) {
    return person.firstName + " " + person.lastName;
});

$( document ).ready(function() {
    $('div#handlebars-wrapper').append(template(data));
});


