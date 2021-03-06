'use strict';

define([
	'library/bootstrap/js/ui-bootstrap-tpls-1.0.3'
        ], function () {

	//컨트롤러 선언
	function _controller($scope) {
	
		//CSS 설정
		$scope.message = "I'm the 1st controller!";
		$scope.greeting = "Hello world!";		
		
		  $scope.myInterval = 5000;
		  $scope.noWrapSlides = false;
		  var slides = $scope.slides = [];
		  var currIndex = 0;

		  $scope.addSlide = function() {
		    var newWidth = 600 + slides.length + 1;
		    slides.push({
		      image: '//lorempixel.com/' + newWidth + '/300',
		      text: ['Nice image','Awesome photograph','That is so cool','I love that'][slides.length % 4],
		      id: currIndex++
		    });
		  };

		  $scope.randomize = function() {
		    var indexes = generateIndexesArray();
		    assignNewIndexesToSlides(indexes);
		  };

		  for (var i = 0; i < 4; i++) {
		    $scope.addSlide();
		  }

		  // Randomize logic below

		  function assignNewIndexesToSlides(indexes) {
		    for (var i = 0, l = slides.length; i < l; i++) {
		      slides[i].id = indexes.pop();
		    }
		  }

		  function generateIndexesArray() {
		    var indexes = [];
		    for (var i = 0; i < currIndex; ++i) {
		      indexes[i] = i;
		    }
		    return shuffle(indexes);
		  }

		  // http://stackoverflow.com/questions/962802#962890
		  function shuffle(array) {
		    var tmp, current, top = array.length;

		    if (top) {
		      while (--top) {
		        current = Math.floor(Math.random() * (top + 1));
		        tmp = array[current];
		        array[current] = array[top];
		        array[top] = tmp;
		      }
		    }

		    return array;
		  }
		  
	}

	//생성한 컨트롤러 리턴
	return _controller;
});
